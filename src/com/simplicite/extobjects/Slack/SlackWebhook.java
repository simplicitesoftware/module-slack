package com.simplicite.extobjects.Slack;

import java.util.List;

import org.json.JSONObject;

import com.simplicite.util.AppLog;
import com.simplicite.util.tools.BusinessObjectTool;
import com.simplicite.util.Grant;
import com.simplicite.util.ObjectDB;
import com.simplicite.util.Tool;
import com.simplicite.util.tools.Parameters;
import com.simplicite.util.exceptions.HTTPException;

/**
 * Slack webhook
 */
public class SlackWebhook extends com.simplicite.webapp.services.RESTServiceExternalObject {
	private static final long serialVersionUID = 1L;
	
    @Override
    public Object get(Parameters params) throws HTTPException {
        return error(400, "Call me in POST please!");
    }

    @Override
    public Object post(Parameters params) throws HTTPException {
        try {
            JSONObject req = params.getJSONObject();
            if (req != null) {
            	AppLog.info(getClass(), "post", req.toString(2), getGrant());
            	// TODO
                return new JSONObject().put("challenge", req.getString("challenge"));
            } else {
                return error(400, "Call me with a JSON body please!");
            }
        } catch (Exception e) {
            return error(e);
        }
    }
}
