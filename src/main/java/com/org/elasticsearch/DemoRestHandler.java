package com.org.elasticsearch;


import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.*;


import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DemoRestHandler extends BaseRestHandler {

    public DemoRestHandler(Settings settings, RestController restController) {
        super(settings);
        restController.registerHandler(RestRequest.Method.GET, "/_hello", this);
    }

    // public void handleRequest(final RestRequest request, final RestChannel channel, final NodeClient client) throws Exception {

    //     String who = request.param("who");
    //     String whoSafe = (who != null) ? who :"world";
    //     channel.sendResponse(new BytesRestResponse(RestStatus.OK, "Hello," + whoSafe + "!"));
    // }

    @Override
    protected RestChannelConsumer prepareRequest(RestRequest request, NodeClient client) throws IOException {
        String who = request.param("who");
        String whoSafe = (who != null) ? who :"world";
        //channel.sendResponse(new BytesRestResponse(RestStatus.OK, "Hello," + whoSafe + "!"));

        return channel->channel.sendResponse(new BytesRestResponse(RestStatus.OK, "Hello," + whoSafe + "!"));
        //return null;
    }
}