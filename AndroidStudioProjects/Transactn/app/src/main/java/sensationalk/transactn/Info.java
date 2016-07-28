package sensationalk.transactn;


import android.accounts.Account;

public class Info
{
    private int _id;
    private String _Name;
    private String _AccountNo;

    public Info(String Name, String AccountNo) {
        this._Name = Name;
        this._AccountNo=AccountNo;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public void set_AccountNo(String _AccountNo) {
        this._AccountNo = _AccountNo;
    }

    public int get_id() {
        return _id;
    }

    public String get_Name() {
        return _Name;
    }

    public String get_AccountNo() {
        return _AccountNo;
    }

}
