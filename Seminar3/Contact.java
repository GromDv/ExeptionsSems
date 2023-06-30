package seminar3;

import java.io.FileWriter;
import java.io.IOException;

public class Contact {
    private String familia;
    private String name;
    private String name2;
    private Long phone;

    public Contact(String[] in) {
        this.familia = in[0];
        this.name = in[1];
        this.name2 = in[2];
        this.phone = Long.parseLong(in[3]);
    }

    public Contact(String familia, String name, String name2, Long phone) {
        this.name = name;
        this.name2 = name2;
        this.familia = familia;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%d>\n", familia, name, name2, phone);
    }

    public void saveContact() {
        try (FileWriter wr = new FileWriter(this.familia, true)) {
            wr.write(this.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}

