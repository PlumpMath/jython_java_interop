package org.jython.book;

import org.jython.book.interfaces.BuildingType;
import org.jython.book.util.JythonObjectFactory;

public class Main{

  public static void main(String args[]) {

    JythonObjectFactory factory = new JythonObjectFactory(
        BuildingType.class, "building", "Building");

    BuildingType building = (BuildingType) factory.createObject();

    building.setBuildingName("BUIDING-A");
    building.setBuildingAddress("100 MAIN ST.");
    building.setBuildingId(1);

    System.out.println(building.getBuildingId() + " " +
        building.getBuildingName() + " " +
        building.getBuildingAddress());
  }

}
