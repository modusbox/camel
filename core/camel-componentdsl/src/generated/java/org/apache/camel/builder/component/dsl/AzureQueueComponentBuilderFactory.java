/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.queue.QueueServiceComponent;

/**
 * Store and retrieve messages from Azure Storage Queue Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureQueueComponentBuilderFactory {

    /**
     * Azure Storage Queue Service (Deprecated) (camel-azure)
     * Store and retrieve messages from Azure Storage Queue Service.
     * 
     * Category: cloud,messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-azure
     * 
     * @return the dsl builder
     */
    @Deprecated
    static AzureQueueComponentBuilder azureQueue() {
        return new AzureQueueComponentBuilderImpl();
    }

    /**
     * Builder for the Azure Storage Queue Service (Deprecated) component.
     */
    interface AzureQueueComponentBuilder
            extends
                ComponentBuilder<QueueServiceComponent> {
        /**
         * The queue service client.
         * 
         * The option is a:
         * &lt;code&gt;com.microsoft.azure.storage.queue.CloudQueue&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param azureQueueClient the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder azureQueueClient(
                com.microsoft.azure.storage.queue.CloudQueue azureQueueClient) {
            doSetProperty("azureQueueClient", azureQueueClient);
            return this;
        }
        /**
         * Set the storage credentials, required in most cases.
         * 
         * The option is a:
         * &lt;code&gt;com.microsoft.azure.storage.StorageCredentials&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param credentials the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder credentials(
                com.microsoft.azure.storage.StorageCredentials credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * Whether to validate the Azure client URI.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param validateClientURI the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder validateClientURI(
                boolean validateClientURI) {
            doSetProperty("validateClientURI", validateClientURI);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Message Time To Live in seconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageTimeToLive the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder messageTimeToLive(
                int messageTimeToLive) {
            doSetProperty("messageTimeToLive", messageTimeToLive);
            return this;
        }
        /**
         * Message Visibility Delay in seconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageVisibilityDelay the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder messageVisibilityDelay(
                int messageVisibilityDelay) {
            doSetProperty("messageVisibilityDelay", messageVisibilityDelay);
            return this;
        }
        /**
         * Queue service operation hint to the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.queue.QueueServiceOperations&lt;/code&gt; type.
         * 
         * Default: listQueues
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder operation(
                org.apache.camel.component.azure.queue.QueueServiceOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set a prefix which can be used for listing the queues.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param queuePrefix the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder queuePrefix(
                java.lang.String queuePrefix) {
            doSetProperty("queuePrefix", queuePrefix);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The Queue Service configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.queue.QueueServiceConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder configuration(
                org.apache.camel.component.azure.queue.QueueServiceConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Set the storage account key used during authentication phase.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param credentialsAccountKey the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder credentialsAccountKey(
                java.lang.String credentialsAccountKey) {
            doSetProperty("credentialsAccountKey", credentialsAccountKey);
            return this;
        }
        /**
         * Set the storage account name used during authentication phase.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param credentialsAccountName the value to set
         * @return the dsl builder
         */
        default AzureQueueComponentBuilder credentialsAccountName(
                java.lang.String credentialsAccountName) {
            doSetProperty("credentialsAccountName", credentialsAccountName);
            return this;
        }
    }

    class AzureQueueComponentBuilderImpl
            extends
                AbstractComponentBuilder<QueueServiceComponent>
            implements
                AzureQueueComponentBuilder {
        @Override
        protected QueueServiceComponent buildConcreteComponent() {
            return new QueueServiceComponent();
        }
        private org.apache.camel.component.azure.queue.QueueServiceConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.queue.QueueServiceComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.queue.QueueServiceConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "azureQueueClient": getOrCreateConfiguration((QueueServiceComponent) component).setAzureQueueClient((com.microsoft.azure.storage.queue.CloudQueue) value); return true;
            case "credentials": getOrCreateConfiguration((QueueServiceComponent) component).setCredentials((com.microsoft.azure.storage.StorageCredentials) value); return true;
            case "validateClientURI": getOrCreateConfiguration((QueueServiceComponent) component).setValidateClientURI((boolean) value); return true;
            case "bridgeErrorHandler": ((QueueServiceComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((QueueServiceComponent) component).setLazyStartProducer((boolean) value); return true;
            case "messageTimeToLive": getOrCreateConfiguration((QueueServiceComponent) component).setMessageTimeToLive((int) value); return true;
            case "messageVisibilityDelay": getOrCreateConfiguration((QueueServiceComponent) component).setMessageVisibilityDelay((int) value); return true;
            case "operation": getOrCreateConfiguration((QueueServiceComponent) component).setOperation((org.apache.camel.component.azure.queue.QueueServiceOperations) value); return true;
            case "queuePrefix": getOrCreateConfiguration((QueueServiceComponent) component).setQueuePrefix((java.lang.String) value); return true;
            case "autowiredEnabled": ((QueueServiceComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "configuration": ((QueueServiceComponent) component).setConfiguration((org.apache.camel.component.azure.queue.QueueServiceConfiguration) value); return true;
            case "credentialsAccountKey": getOrCreateConfiguration((QueueServiceComponent) component).setCredentialsAccountKey((java.lang.String) value); return true;
            case "credentialsAccountName": getOrCreateConfiguration((QueueServiceComponent) component).setCredentialsAccountName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}