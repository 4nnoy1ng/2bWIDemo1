package at.dan.oo.projects.handy;

public class Camera {
 private int fileNumber = 0;

 public  PhoneFile takePicture(){
     PhoneFile file = new PhoneFile("jpg",1000,"pic" + fileNumber);
     fileNumber++;
     return file;
 }
}
