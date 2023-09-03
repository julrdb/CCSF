package M6;

public class copyConstructorExample{
  private int num;

  public copyConstructorExample(){  //default constructor
    num=0;
  }

  public copyConstructorExample(int x){ //argumented constructor
    num=x;
  }  

  public copyConstructorExample(copyConstructorExample C){ //copy constructor
    num=C.num;
  }

  public void setNum(int x){
    num=x;
  }

  public int getNum(){
    return num;
  }

  public void change(){
    num+=10;
  }

  public String toString(){
    return("num= " + num);
  }

  public boolean equals(copyConstructorExample other){
    if (num==other.num)
      return true;
    else
      return false;
  }


}