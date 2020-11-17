import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {

  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

  public static void main(String[]args) {

    people = new ArrayList<Person>();
    filename = "persons.txt";
    String Name = "", Age = "", Color = "";

    people.add(new Person("Suraj", 22, "Black"));
    people.add(new Person("A", 87, "Pink"));
    people.add(new Person("B", 13, "Yellow"));
    people.add(new Person("C", 55, "Black"));
    people.add(new Person("D", 4, "Green"));


    try {
      myFile = new FileReader(filename);
      BufferedReader reader = new BufferedReader(myFile);


      while (reader.ready()) {
        Name = reader.readLine();
        Age = reader.readLine();
        Color = reader.readLine();

        Person thePerson = new Person(Name, Integer.parseInt(Age), Color);
        people.add(thePerson);
      }
      reader.close();
    } catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
    }
  
  for(int i=0;i<people.size();i++) {
    System.out.printf("%-25s %-20s %-20s %n", people.get(i).getName(), people.get(i).getAge(), people.get(i).getColor());
  }

  FileWriter toWriteFile;
  try
  {
    toWriteFile = new FileWriter("data.txt");

    BufferedWriter output = new BufferedWriter(toWriteFile);

    for(int i=0;i<people.size();i++) {
      output.write(people.get(i).getName());
      output.newLine();
      output.write(Integer.toString(people.get(i).getAge()));
      output.newLine();
      output.write(people.get(i).getColor());
      output.newLine();

      output.flush();

    }
    output.close();

  }
  catch(IOException except) {
    except.printStackTrace();
  }
}
}