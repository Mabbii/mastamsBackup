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

public class ImageUpload {
    public ImageUpload() {
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
        System.out.println("Inside Upload Image");
        UploadedFile myfile =  getFile(); 
        System.out.println("myfile");
        BindingContext bindingctx = BindingContext.getCurrent();
        System.out.println("bindingctx");
        BindingContainer bindings = bindingctx.getCurrentBindingsEntry();
        System.out.println("bindings");
        DCBindingContainer bindingsImpl = (DCBindingContainer)bindings;
        System.out.println("bindingsimpl");
        DCIteratorBinding iter = bindingsImpl.findIteratorBinding("ImagesTableVO1Iterator");
        System.out.println("iter");
        Row row = iter.getCurrentRow();
        System.out.println("row");
        row.setAttribute("ImageBlob", createBlobDomain(myfile));
        System.out.println("ImageBlob");
        return null;
    }
    
    private BlobDomain createBlobDomain(UploadedFile file){
        
        InputStream in = null;
        BlobDomain blobDomain = null;
        OutputStream out = null;
        
        try{
            in = file.getInputStream();
            blobDomain = new BlobDomain();
            out = blobDomain.getBinaryOutputStream();
            byte[] buffer = new byte[8192];
            int bytesRead = 0;
            
            while ((bytesRead = in.read(buffer, 0, 8192)) != -1){
                out.write(buffer, 0, bytesRead);
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
