package com.simplicite.extobjects.Slack;

import org.json.JSONObject;

import com.simplicite.util.AppLog;
import com.simplicite.util.exceptions.APIException;
import com.simplicite.util.tools.Parameters;
import com.simplicite.util.tools.SlackTool;

/**
 * Slack client example
 */
public class SlackClientExample extends com.simplicite.webapp.web.ResponsiveExternalObject {
	private static final long serialVersionUID = 1L;
	
	@Override
	public Object service(Parameters params) {
		try {
			String message = params.getParameter("message");
			AppLog.info(getClass(), "service", "Posting to Slack, message: " + message, getGrant());
			SlackTool st = new SlackTool(getGrant());
			st.postMessage("demo", message);
			return new JSONObject().put("message", message).put("status", 200);
		} catch (APIException e) {
			AppLog.error(getClass(), "service", null, e, getGrant());
			return null;
		}
	}
}
