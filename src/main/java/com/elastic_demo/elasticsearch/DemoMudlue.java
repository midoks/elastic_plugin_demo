

import java.util.Collection;  
import java.util.Collections;  
  
import org.elasticsearch.common.inject.Module;  
import org.elasticsearch.plugins.Plugin;


public DemoPlugin extends Plugin{

    public void DemoPlugin(){

        
    }

	@Override  
    public String name() {  
        return "DemoPlugin";  
    }  
    @Override  
    public String description() {  
        return "DemoPlugin";  
    }

    // public Collection<Module> nodeModules() {  
    //     //加入自定义处理模块  
    //     return Collections.<Module>singletonList(new HelloWorldModule());  
    // }  


}