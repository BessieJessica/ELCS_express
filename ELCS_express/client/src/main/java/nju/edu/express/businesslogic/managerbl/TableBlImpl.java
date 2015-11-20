package nju.edu.express.businesslogic.managerbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.TablePO;
import nju.edu.express.VO.TableVO;
import nju.edu.express.managerblservice.TableBlService;
import nju.edu.express.managerdataservice.TableDataService;

public class TableBlImpl implements TableBlService {

	TableDataService tableData;

	public TableBlImpl() {
		try {
			tableData = (TableDataService) Naming
					.lookup("rmi://127.0.0.1:6600/TableData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public TableVO[] getTableList() {

		TablePO[] tablePOList = null;
		TableVO[] tableVOList = null;
		try {
			tablePOList = tableData.getTableList();
			tableVOList = new TableVO[tablePOList.length];
			for (int i = 0; i < tableVOList.length; i++)
				tableVOList[i] = transformP2V(tablePOList[i]);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return tableVOList;
	}

	@Override
	public boolean endTable(String[] tableID) {

		try {
			return tableData.updateTable(tableID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private TableVO transformP2V(TablePO tablePO) {
		// TODO Auto-generated method stub
		return null;
	}

}
