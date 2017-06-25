package com.elastic_plugin_demo.elasticsearch;

import java.util.Collection;  
import java.util.Collections;  
  
import org.apache.logging.log4j.Logger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Setting;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.IndexModule;
import org.elasticsearch.common.inject.Module;  
import org.elasticsearch.plugins.Plugin;


public class DemoPlugin extends Plugin {


    public String name() {  
        return "DemoPlugin";
    }

     
    public String description() {  
        return "DemoPlugin";  
    }

    // public Collection<Module> nodeModules() {  
    //     //加入自定义处理模块  
    //     return Collections.<Module>singletonList(new HelloWorldModule());  
    // }  


}