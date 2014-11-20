/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package distantshoresmedia.org.model;

import distantshoresmedia.org.model.*;

public class DefaultKeyPosition extends BaseDataClass {


	private int columnCount;
 	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	public int getColumnCount() {
		return columnCount;
	}


	private int rowIndex;
 	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public int getRowIndex() {
		return rowIndex;
	}


	private int keyboardTypeID;
 	public void setKeyboardTypeID(int keyboardTypeID) {
		this.keyboardTypeID = keyboardTypeID;
	}
	public int getKeyboardTypeID() {
		return keyboardTypeID;
	}

    public DefaultKeyPosition(int uid, int created, int updated, int columnCount, int rowIndex, int keyboardTypeID){
        super(uid, created, updated);
        this.columnCount = columnCount;
        this.rowIndex = rowIndex;
        this.keyboardTypeID = keyboardTypeID;
    }

}