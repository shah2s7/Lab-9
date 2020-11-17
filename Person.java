class Person {
  String Name;
  int Age;
  String Color;

  Person(String aName, int aAge, String aColor) {
    Name = aName;
    Age = aAge;
    Color = aColor;
  }
  
  String getName() {
    return Name;
  }

  int getAge() {
    return Age;
  }

  String getColor() {
    return Color;
  }
}
