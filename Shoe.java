
import java.text.*;

public class Shoe
{
  private String brand;
  private String model;
  private double size;

  // default constructor
  public Shoe ()
  {
    brand = " Do not have this shoe";
    model = " Do not have this shoe model ";
    size = 0.0;
  }
  //overloaded construtor 
  public Shoe (String startBrand, String startModel, double startSize)
  {

    brand = startBrand;
    setModel (startModel);
    setSize (startSize);
  }




  public String getBrand ()
  {
    return brand;
  }				//getbrand

  public String getModel ()
  {
    return model;
  }				//getmodel

  public double getSize ()
  {
    return size;

  }				//getSize

  public Shoe setBrand (String brand)
  {
    this.brand = brand;
    return this;
  }				//setBrand

  public Shoe setModel (String model)
  {
    if (model == "     ");	//  ((a[0] & 1) == 0
    {
      this.model = model;
    }
    return this;
  }				//setmodel

  public Shoe setSize (double size)
  {
    if (size >= 0.0)
      this.size = size;
    return this;

  }				//setsize
  /////////////////////////////// 2 other methods
  public double sizeInUk ()
  {
    if (size >= 0.0001)
      return size - 0.50;
    else
      return 0.0;

  }

  public double sizeInJapan ()
  {
    return size + 18;
  }
  ////////////////////////////////// toString Method
  @Override public String toString ()
  {
    DecimalFormat sizeFormat = new DecimalFormat ("0.00");

    return "\nBrand : " + brand + "\nModel of shoe : " +
      model + " \nSize of shoe : " + sizeFormat.format (size);
  }




}
