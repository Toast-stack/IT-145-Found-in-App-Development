public class Monkey extends RescueAnimal{
private String species,tailLength,height,bodyLength;
public Monkey(String name,String species,String tailLength,String height,String bodyLength,String gender,String age,String weight,String acquisitionDate,String acquisitionCountry,String trainingStatus,boolean reserved,String inServiceCountry) {
setName(name);
setGender(gender);
setAge(age);
setWeight(weight);
setAcquisitionDate(acquisitionDate);
setAcquisitionCountry(acquisitionCountry);
setTrainingStatus(trainingStatus);
setReserved(reserved);
setInServiceCountry(inServiceCountry);
setSpecies(species);
setTailLength(tailLength);
setHeight(height);
setBodyLength(bodyLength);
}
public String getSpecies() {
return species;
}
public String getTailLength() {
return tailLength;
}
public String getHeight() {
return height;
}
public String getBodyLength() {
return bodyLength;
}
public void setSpecies(String species) {
this.species = species;
}
public void setTailLength(String tailLength) {
this.tailLength = tailLength;
}
public void setHeight(String height) {
this.height = height;
}
public void setBodyLength(String bodyLength) {
this.bodyLength = bodyLength;
}
@Override
public String toString() {
return super.toString()+"\nMonkey species: " + species + "\ntailLength: " + tailLength + "\nheight: " + height + "\nbodyLength: "
+ bodyLength ;
}


}