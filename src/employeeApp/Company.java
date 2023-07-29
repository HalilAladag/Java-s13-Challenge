package employeeApp;

import java.util.Arrays;

class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = new String[0];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro cannot be negative");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addDeveloper(int index, String name) {
        if (index >= developerNames.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        if (developerNames[index] != null) {
            throw new IllegalArgumentException("Index is already added.");
        }
        developerNames[index] = name;
    }

    public String toString(){
        return "Name:"+ name + " Giro: "+ giro + " developers: " + Arrays.toString(developerNames);
}
}