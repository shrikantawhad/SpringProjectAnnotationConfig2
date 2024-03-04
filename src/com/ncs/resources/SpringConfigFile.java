package com.ncs.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.ncs.beans")
//@ComponentScan({"com.ncs.beans", "com.ncs.main"}) //for scanning multiple packages
@ComponentScan(basePackages = {"com.ncs.beans", "com.ncs.main"})
public class SpringConfigFile {

}
