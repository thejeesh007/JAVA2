class thejeesh20
 
{
public int roll;
public String name;
thejeesh20(int roll,String name)
{
this.roll=roll;
this.name=name;
}
 
public static void main(String[]args)
{
thejeesh20[]arr;
arr=new thejeesh20[5];
arr[0]=new thejeesh20(1,"A");
arr[1]=new thejeesh20(2,"b");
arr[2]=new thejeesh20(3,"c");
arr[3]=new thejeesh20(4,"d");
arr[4]=new thejeesh20(5,"e");
for (int i=0;i<arr.length;i++)
{
System.out.println(arr[i].roll+" "+arr[i].name);
}
}
}
