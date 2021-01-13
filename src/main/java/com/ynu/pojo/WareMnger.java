package com.ynu.pojo;

/*
这是仓库管理员
 */
public class WareMnger {
    private int m_id;   //管理员编号
    private String m_password;  //密码
    private String m_name;
    private String m_tel;
    private String m_addr;
    private int m_wnum; //管理仓库编号

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_tel() {
        return m_tel;
    }

    public void setM_tel(String m_tel) {
        this.m_tel = m_tel;
    }

    public String getM_addr() {
        return m_addr;
    }

    public void setM_addr(String m_addr) {
        this.m_addr = m_addr;
    }

    public int getM_wnum() {
        return m_wnum;
    }

    public void setM_wnum(int m_wnum) {
        this.m_wnum = m_wnum;
    }

    @Override
    public String toString() {
        return "wareMnger{" +
                "m_id=" + m_id +
                ", m_password='" + m_password + '\'' +
                ", m_name='" + m_name + '\'' +
                ", m_tel='" + m_tel + '\'' +
                ", m_addr='" + m_addr + '\'' +
                ", m_wnum=" + m_wnum +
                '}';
    }
}
