package crc64c622dfc70cdcb4a3;


public class ConnectionResponseCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionResponse:(Ljava/lang/String;Lcom/google/android/gms/common/api/Status;[B)V:GetOnConnectionResponse_Ljava_lang_String_Lcom_google_android_gms_common_api_Status_arrayBHandler:Android.Gms.Nearby.Connection.IConnectionsConnectionResponseCallbackInvoker, Xamarin.GooglePlayServices.Nearby\n" +
			"";
		mono.android.Runtime.register ("ConnectionsQuickstart.ConnectionResponseCallback, ConnectionsQuickstart", ConnectionResponseCallback.class, __md_methods);
	}


	public ConnectionResponseCallback ()
	{
		super ();
		if (getClass () == ConnectionResponseCallback.class)
			mono.android.TypeManager.Activate ("ConnectionsQuickstart.ConnectionResponseCallback, ConnectionsQuickstart", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionResponse (java.lang.String p0, com.google.android.gms.common.api.Status p1, byte[] p2)
	{
		n_onConnectionResponse (p0, p1, p2);
	}

	private native void n_onConnectionResponse (java.lang.String p0, com.google.android.gms.common.api.Status p1, byte[] p2);

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
