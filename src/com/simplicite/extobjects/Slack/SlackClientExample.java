package com.simplicite.extobjects.Slack;

import org.json.JSONArray;
import org.json.JSONObject;

import com.simplicite.util.AppLog;
import com.simplicite.util.exceptions.APIException;
import com.simplicite.util.tools.Parameters;
//import com.simplicite.util.tools.SlackTool;

/**
 * Slack client example
 */
public class SlackClientExample extends com.simplicite.util.ExternalObject {
	private static final long serialVersionUID = 1L;
	
	@Override
	public Object display(Parameters params) {
		try {
			setHTML(getDisplay());
		} catch (Exception e) {
			AppLog.error(getClass(), "display", null, e, getGrant());
			setHTML("Error: " + e.getMessage());
		}
		return javascript("void(0);");
	}
}
