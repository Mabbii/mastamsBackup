package view;

import javax.sql.DataSource;
import java.io.BufferedInputStream;
//import java.sql.DriverManager;
import java.io.IOException;
//import java.io.PrintWriter;
import java.io.OutputStream;

import java.sql.SQLException;
import java.sql.Blob;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.*;
import javax.servlet.http.*;

public class imageservlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        String imgeId = request.getParameter("id");
        OutputStream os = response.getOutputStream();
        Connection conn = null;
        
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/virkdbconDS");
            conn = ds.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT image_id, image_blob FROM IMAGES_TABLE WHERE image_id=?");
            statement.setInt(1, new Integer(Integer.parseInt(imgeId)));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                Blob blob = rs.getBlob("IMAGE_BLOB");
                BufferedInputStream in = new BufferedInputStream(blob.getBinaryStream());
                int b;
                byte[] buffer = new byte[10240];
                    while ((b = in.read(buffer, 0, 10240)) != -1){
                        os.write(buffer, 0, b);
                    }
                os.close();
                }
            
        }catch (Exception e ){
            System.out.println("Exception generetaed from here");
        }finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException sqle) {
                System.out.println("SQLExecption error");
            }
        }
                
            
        }
        
}
