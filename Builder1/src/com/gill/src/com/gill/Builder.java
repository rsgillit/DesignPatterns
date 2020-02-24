package com.gill;

interface Builder1
{
     void startUpOperations();
     void buildBody();
     void insertWheels();
     void addHeadlights();
     void  endOperations();
     /*The following method is used to retrieve the object that is constructed.*/
     Product getVehicle();
}