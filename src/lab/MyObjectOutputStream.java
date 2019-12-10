package lab;

/*import java.io.IOException;
import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream{
    //Inheritance the ObjectOutputStream
    public MyObjectOutputStream(OutputStream fos) throws IOException{
        super(fos);
        //Call the constructor in the parent class(ObjectOutputStream)
    }
*/

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MyObjectOutputStream() throws IOException {
        super();
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }
}

