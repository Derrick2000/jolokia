package org.jolokia.service.notif.sse.osgi;

import org.jolokia.server.core.service.api.JolokiaService;
import org.jolokia.server.core.service.notification.NotificationBackend;
import org.jolokia.service.notif.sse.SseNotificationBackend;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Simple activator for creating a JMX request handler
 *
 * @author roland
 * @since 02.03.14
 */
public class SseNotificationServiceActivator implements BundleActivator {

    /** {@inheritDoc} */
    public void start(BundleContext context) throws Exception {
        context.registerService(new String[] {
                JolokiaService.class.getName(),
                NotificationBackend.class.getName()
        },new SseNotificationBackend(0),null);
    }

    /** {@inheritDoc} */
    public void stop(BundleContext context) throws Exception { }
}
