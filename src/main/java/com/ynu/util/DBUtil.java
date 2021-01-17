package com.ynu.util;

import java.sql.*;
import java.util.UUID;

public class DBUtil {

    private static String URL = "jdbc:mysql://121.196.147.134:3306/testforeignKey?characterEncoding=UTF-8";

    private static String DriverName = "com.mysql.jdbc.Driver";

    private static String UserName = "root";

    private static String PassWord = "123456";

    private static Connection con = null;

    public static Connection getConnection() throws ClassNotFoundException {
          Class.forName(DriverName);
        try {
             con = DriverManager.getConnection(URL,UserName,PassWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 清理资源
     * @param con
     * @param ps
     * @param rs
     */
    public static void closeResource(Connection con , PreparedStatement ps , ResultSet rs){
        try{
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void search() throws ClassNotFoundException {  //查询数据
        con = DBUtil.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from buyer");
            ResultSet rs= ps.executeQuery();

            while (rs.next()){
//                System.out.println("查询");
                int id = rs.getInt("u_id2");
                String name = rs.getString("u_name");
                String sex = rs.getString("u_sex");
                System.out.println(id +" "+name +" "+sex);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int add() throws ClassNotFoundException{//新增数据
        con= DBUtil.getConnection();
        try{

            PreparedStatement ps=con.prepareStatement("insert into student values (6,'王二', 3)");
            int re=ps.executeUpdate();
//            System.out.println(re);
            return re;
        }catch (SQLException e){
            e.printStackTrace();
            return 0;
        }
    }
    public static int delete() throws ClassNotFoundException{//删除数据
        con= DBUtil.getConnection();
        try{
            PreparedStatement ps=con.prepareStatement("delete from class where classId=1");
            int re=ps.executeUpdate();
//            System.out.println(re);
            return re;
        }catch (SQLException e){
            e.printStackTrace();
            return 0;
        }
    }

    public static void update() throws ClassNotFoundException{//更新数据
        con= DBUtil.getConnection();
        try{
            PreparedStatement ps=con.prepareStatement("update buyer set u_sex='女' where u_id2='001'");
            boolean re=ps.execute();
//            System.out.println(re);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    /*
    随机生成数据库id
     */
    public static String getUUID() {
        String id =null;
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();

        //去掉随机ID的短横线
        id = id.replace("-", "");

        //将随机ID换成数字
        int num = id.hashCode();
        //去绝对值
        num = num < 0 ? -num : num;

        id = String.valueOf(num);

        return id;
    }


    public static void main(String[] args) throws ClassNotFoundException {
//        con=getConnection();
//        if(con != null){
//            System.out.println("连接成功!");
//        }
//        else {
//            System.out.println("连接失败!");
//        }

        int isAdd=add();

        System.out.println(isAdd);


    }
}
