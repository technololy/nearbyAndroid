package crc64c622dfc70cdcb4a3;


public class MyConnectionsEndpointDiscoveryListener
	extends com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEndpointFound:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnEndpointFound_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler\n" +
			"n_onEndpointLost:(Ljava/lang/String;)V:GetOnEndpointLost_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("ConnectionsQuickstart.MyConnectionsEndpointDiscoveryListener, ConnectionsQuickstart", MyConnectionsEndpointDiscoveryListener.class, __md_methods);
	}


	public MyConnectionsEndpointDiscoveryListener ()
	{
		super ();
		if (getClass () == MyConnectionsEndpointDiscoveryListener.class)
			mono.android.TypeManager.Activate ("ConnectionsQuickstart.MyConnectionsEndpointDiscoveryListener, ConnectionsQuickstart", "", this, new java.lang.Object[] {  });
	}

	public MyConnectionsEndpointDiscoveryListener (crc64c622dfc70cdcb4a3.MainActivity p0)
	{
		super ();
		if (getClass () == MyConnectionsEndpointDiscoveryListener.class)
			mono.android.TypeManager.Activate ("ConnectionsQuickstart.MyConnectionsEndpointDiscoveryListener, ConnectionsQuickstart", "ConnectionsQuickstart.MainActivity, ConnectionsQuickstart", this, new java.lang.Object[] { p0 });
	}


	public void onEndpointFound (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_onEndpointFound (p0, p1, p2);
	}

	private native void n_onEndpointFound (java.lang.String p0, java.lang.String p1, java.lang.String p2);


	public void onEndpointLost (java.lang.String p0)
	{
		n_onEndpointLost (p0);
	}

	private native void n_onEndpointLost (java.lang.String p0);

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
