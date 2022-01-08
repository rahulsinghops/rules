package com.ipru.mca.bre.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bre")
public class BreProperties {
	String loggingenabled ;
			String	standard ;
					String externalflag ;
					public String getLoggingenabled() {
						return loggingenabled;
					}
					public void setLoggingenabled(String loggingenabled) {
						this.loggingenabled = loggingenabled;
					}
					public String getStandard() {
						return standard;
					}
					public void setStandard(String standard) {
						this.standard = standard;
					}
					public String getExternalflag() {
						return externalflag;
					}
					public void setExternalflag(String externalflag) {
						this.externalflag = externalflag;
					}
					
					
}
