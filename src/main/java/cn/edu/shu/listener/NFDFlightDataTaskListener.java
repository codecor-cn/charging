package cn.edu.shu.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import cn.edu.shu.task.TimeManager;

public class NFDFlightDataTaskListener implements  ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//执行定时任务
		new TimeManager();
	}


}
