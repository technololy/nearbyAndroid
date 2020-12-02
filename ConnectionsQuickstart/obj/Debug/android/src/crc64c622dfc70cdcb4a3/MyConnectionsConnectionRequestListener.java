package crc64c622dfc70cdcb4a3;


public class MyConnectionsConnectionRequestListener
	extends com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionRequest:(Ljava/lang/String;Ljava/lang/String;[B)V:GetOnConnectionRequest_Ljava_lang_String_Ljava_lang_String_arrayBHandler\n" +
			"";
		mono.android.Runtime.register ("ConnectionsQuickstart.MyConnectionsConnectionRequestListener, ConnectionsQuickstart", MyConnectionsConnectionRequestListener.class, __md_methods);
	}


	public MyConnectionsConnectionRequestListener ()
	{
		super ();
		if (getClass () == MyConnectionsConnectionRequestListener.class)
			mono.android.TypeManager.Activate ("ConnectionsQuickstart.MyConnectionsConnectionRequestListener, ConnectionsQuickstart", "", this, new java.lang.Object[] {  });
	}

	public MyConnectionsConnectionRequestListener (crc64c622dfc70cdcb4a3.MainActivity p0)
	{
		super ();
		if (getClass () == MyConnectionsConnectionRequestListener.class)
			mono.android.TypeManager.Activate ("ConnectionsQuickstart.MyConnectionsConnectionRequestListener, ConnectionsQuickstart", "ConnectionsQuickstart.MainActivity, ConnectionsQuickstart", this, new java.lang.Object[] { p0 });
	}


	public void onConnectionRequest (java.lang.String p0, java.lang.String p1, byte[] p2)
	{
		n_onConnectionRequest (p0, p1, p2);
	}

	private native void n_onConnectionRequest (java.lang.String p0, java.lang.String p1, byte[] p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
