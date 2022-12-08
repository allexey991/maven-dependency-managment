package com.dm;

import com.dma.DependencyAClass;
import com.dma.DependencyBClass;

public class Main {
  public static void main(String[] args) {
    DependencyAClass dependencyAClass = new DependencyAClass();
    printVersion(dependencyAClass.getClass(),
                 dependencyAClass.getVersion());
    DependencyBClass dependencyBClass = new DependencyBClass();
    printVersion(dependencyBClass.getClass(),
                 dependencyBClass.getVersion());

  }

  private static void printVersion(Class<?> clazz,
                                   String version) {
    System.out.println("------------------------------------");
    System.out.println("Imported " + clazz
                           + "\n"
                           + "version: " + version);
    System.out.println("------------------------------------");
  }
}