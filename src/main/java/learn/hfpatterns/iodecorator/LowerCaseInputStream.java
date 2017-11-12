package learn.hfpatterns.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Converts all uppercase characters to lowercase
     * in underlying input stream.
     *
     * @param in the underlying input stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int charInt = super.read();
        if (charInt >= 'A' && charInt <= 'Z') {
            charInt += 'a' - 'A';
        }
        return charInt;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
