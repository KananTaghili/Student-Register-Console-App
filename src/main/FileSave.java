package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileSave {

	public static void saveFile() {
		try {
			writeObjectToFile(Data.d, "file.obj");
		} catch (Exception ex) {

		}
	}

	public static Data getData() {
		Data data = null;
		try {
			data = (Data) readFileDeserialize("file.obj");
		} catch (Exception ex) {
			return data;
		}
		return data;
	}

	public static Object readFileDeserialize(String name) throws Exception {
		Object obj = null;
		FileInputStream fi = new FileInputStream(name);
		try (ObjectInputStream in = new ObjectInputStream(fi);) {
			obj = in.readObject();
		} catch (Exception ex) {
			return obj;
		}
		return obj;
	}

	public static void writeObjectToFile(Serializable object, String name) throws Exception {
		try (FileOutputStream fout = new FileOutputStream(name);
				ObjectOutputStream ous = new ObjectOutputStream(fout);) {
			ous.writeObject(object);
		}
	}
}
