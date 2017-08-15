import java.io.*;
public class Bytecode {

	private static byte checksum(byte[] a)
	{
		byte  checkSum=0;	
		for(byte by:a)
			{
			checkSum=(byte)(((checkSum & 0xFF) >>> 1)+(checkSum & 0x1)<<(int)Math.pow(2,15));
			checkSum+=by;
			}
		return checkSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte currentby;
		int k=0;
		byte []a =new byte[29302];
		try{
			
			while((currentby=(byte)System.in.read())!=-1)
			{
				a[k++]=currentby;
			}
			}
		catch(IOException e)
		{
			System.err.println(e.getMessage());
		}
		
		finally{
			try{System.in.close();}
			catch(IOException e)
			{
				System.err.println(e.getMessage());
			}
		}
		
		System.out.println(checksum(a));
		
	}

}
