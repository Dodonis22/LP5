
import java.rmi.*;
import java.rmi.server.*;


public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
	
	public ServerImpl() throws RemoteException
	{
		
	}
	@Override
	public int addition(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}@Override
	public int division(int a, int b) throws RemoteException {
		if(b!=0)
		{
			return a/b;
		}
		else
		{
			System.out.println("Cannot be divided by Zero");
		}
		return a/b;
	}@Override
	public int substraction(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}@Override
	public int multiplication(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

}
