package io.dockstore;

import java.util.HashMap;

import io.dockstore.zenodo.client.ApiClient;
import io.dockstore.zenodo.client.ApiException;
import io.dockstore.zenodo.client.api.PreviewApi;
import org.junit.Assert;
import org.junit.Test;

public class ZenodoClientTest {

    @Test
    public void testZenodoClient() throws ApiException {
        ApiClient client = new ApiClient();
        PreviewApi previewApi = new PreviewApi(client);
        client.setDebugging(true);
        HashMap<String, Object> o = (HashMap<String, Object>)previewApi.listCommunities();
        Assert.assertTrue("not able to list communities as basic test", o != null && o.keySet().size() > 0);
    }
}
