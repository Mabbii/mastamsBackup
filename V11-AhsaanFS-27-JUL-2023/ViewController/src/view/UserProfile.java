package view;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import oracle.binding.BindingContainer;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.jbo.Row;
import oracle.jbo.domain.BlobDomain;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class UserProfile {
    public UserProfile() {
        super();
    }
    private UploadedFile _file;

    public void setFile(UploadedFile _file) {
        this._file = _file;
    }

    public UploadedFile getFile() {
        return _file;
    }
    
    public String uploadImage(){
        
        UploadedFile myfile =  this.getFile();        
        BindingContext bindingctx = BindingContext.getCurrent();        
        BindingContainer bindings = bindingctx.getCurrentBindingsEntry();        
        DCBindingContainer bindingsImpl = (DCBindingContainer)bindings;        
        DCIteratorBinding iter = bindingsImpl.findIteratorBinding("UserProfileVO1Iterator");        
        Row row = iter.getCurrentRow();       
        row.setAttribute("USER_PROFILE_IMAGE", createBlobDomain(myfile));
        
        return null;
    }
    
    private BlobDomain createBlobDomain(UploadedFile file){
        
        InputStream in = null;
        BlobDomain blobDomain = null;
        OutputStream out = null;
        try{
            System.out.println("13.try");
            in = file.getInputStream();
            System.out.println("14.in");
            blobDomain = new BlobDomain();
            System.out.println("15.BlobDomain");
            out = blobDomain.getBinaryOutputStream();
            System.out.println("16.out");
            byte[] buffer = new byte[8192];
            System.out.println("17.oubyte[]");
            int bytesRead = 0;
            System.out.println("18.bytesRead");
            while ((bytesRead = in.read(buffer, 0, 8192)) != -1){
                System.out.println("19.while");
                out.write(buffer, 0, bytesRead);
                System.out.println("20.out.write");
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
            }catch (SQLException e){
                e.fillInStackTrace();
            }
        return blobDomain;
    }
    
    
    
}
