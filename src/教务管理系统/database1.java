package �������ϵͳ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database1 {
public static void main(String[] args) {
  
    Connection con;
    // ����������
    String driver = "com.mysql.jdbc.Driver";
    // URLָ��Ҫ���ʵ����ݿ��� test
    String url = "jdbc:mysql://localhost:3306/manager?serverTimezone=UTC&useSSL=false";
    // MySQL����ʱ���û���
    String user = "root";
    // MySQL����ʱ������
    String password = "1314521..";
    // ������ѯ�����
    try {
        // ������������
        Class.forName(driver);
        // 1.getConnection()����������MySQL���ݿ⣡��
        con = DriverManager.getConnection(url, user, password);
        if (!con.isClosed())
            System.out.println("\n\t\t�ɹ��� " + user + " ������ӵ����ݿ⣡����");

        // 2.����statement���������ִ��SQL��䣡��
        Statement statement = con.createStatement();
        // Ҫִ�е�SQL���
        String sql = "select *from user_table";
     //  PreparedStatement prestmt=con.prepareStatement(sql);
      // prestmt.setInt(2, 2017000002);
      // prestmt.setString(1, "000002");
       //prestmt.setString(3, "ѧ��");
     //  prestmt.executeUpdate();
        // 3.ResultSet�࣬������Ż�ȡ�Ľ��������
        ResultSet rs = statement.executeQuery(sql);
      //  System.out.println("\n\t\tִ�н��������ʾ:");
      //  System.out.println("\t\t-----------------------------------------------------------------");
      //  System.out.println("\t\t|\t" + "ID" + "\t" + "����" + "\t" + "�Ա�" + "\t" + "����" + "\t" + "�ֻ�����" + "\t\t" + "��ַ\t|");
      //  System.out.println("\t\t-----------------------------------------------------------------");

        int ID = 0;
        String password1 = null;
        String positon = null;
        //int Age = 0;
       // String Phone = null;
        //String Address = null;

    while (rs.next()) {
            // ��ȡ ID ��������
            ID = rs.getInt("user_id");
            // ��ȡ Name ��������
            password1 = rs.getString("user_password");
            // ��ȡ Sex ��������
           positon = rs.getString("user_position");
                  System.out.println("\t\t|\t" + ID + "\t" + password1 + "\t" + positon );
        }
      
        System.out.println("\t\t-----------------------------------------------------------------");
       rs.close();
      //  prestmt.close();
        con.close();
    }
    catch (ClassNotFoundException e) {
        // ���ݿ��������쳣����
        System.out.println("Sorry,can`t find the Driver!");
        e.printStackTrace();
    }
    catch (SQLException e) {
        // ���ݿ�����ʧ���쳣����
        e.printStackTrace();
    }
    catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
    finally {
        System.out.println("\t\t\t\t\t\t\t\t��ȡ���ݿ�������ϣ�!��");
    }
}
}