/**
 * 
 */
package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.core.model.CarModel;

/**
 * @author x222389
 *
 */
public class SerializationDemoTest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarModel carModel = new CarModel();
		carModel.setCarNO("Maruti00127");
		carModel.setEngineType("Diesel");
		carModel.setYear(2005);

		ObjectOutputStream outputStream;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("F:/Kumar/input.txt"));
			System.out.println("write object to file");
			outputStream.writeObject(carModel);

			System.out.println("---------------------------");
			ObjectInputStream inputStream;
			CarModel carDeSerializedModel = new CarModel();
			inputStream = new ObjectInputStream(new FileInputStream("F:/Kumar/input.txt"));
			carDeSerializedModel = (CarModel) inputStream.readObject();
			System.out.println("DeSerialized object:" + carDeSerializedModel.getCarNO()+" "
					+ carDeSerializedModel.getEngineType() +" "+ carDeSerializedModel.getYear());
			System.out.println("are both object is same:"+carModel.equals(carDeSerializedModel));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
