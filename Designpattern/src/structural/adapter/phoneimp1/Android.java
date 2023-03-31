package structural.adapter.phoneimp1;

import structural.adapter.phoneIface.MicroUsbPhone;

public class Android implements MicroUsbPhone {
private boolean connector;
	@Override
	public void recharge() {
		// TODO Auto-generated method stub

		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else
			System.out.println("Connect microusb first");
	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("microusb connected");
	}

}
