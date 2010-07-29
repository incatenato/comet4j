package org.kedacom.comet.event;

import javax.servlet.ServletContext;

import org.kedacom.comet.CometContext;
import org.kedacom.event.Event;
import org.kedacom.event.demo.mac.SubEventType;

public class CometContextEvent  extends Event<CometContext> {
	public static SubEventType INITIALIZED = new SubEventType();
	public static SubEventType DESTROYED = new SubEventType();
	private SubEventType subType;
	private ServletContext servletContext;
	private CometContext cometContext;
	
	public CometContextEvent(CometContext target,SubEventType anSubType) {
		super(target);
		subType = anSubType;
	}

	public SubEventType getSubType() {
		return subType;
	}

	public void setSubType(SubEventType subType) {
		this.subType = subType;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public CometContext getCometContext() {
		return cometContext;
	}

	public void setCometContext(CometContext cometContext) {
		this.cometContext = cometContext;
	}
	public void destroy() {
		super.destroy();
		subType = null;
		servletContext = null;
		cometContext = null;
	}
}
