/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.platform.runtime.context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.platform.api.context.AppContext;
import org.platform.api.context.InitContext;
import org.platform.runtime.WebHelper;
/**
 * 对{@link AppContext}接口的基本实现，这个类主要负责处理HttpServletRequest、HttpServletResponse
 * @version : 2013-4-3
 * @author 赵永春 (zyc@byshell.org)
 */
public abstract class AbstractAppContext extends AppContext {
    private InitContext initContext = null;
    public AbstractAppContext(InitContext initContext) {
        this.initContext = initContext;
    }
    @Override
    public InitContext getInitContext() {
        return this.initContext;
    }
    /**取得{@link HttpServletRequest}类型对象。*/
    public HttpServletRequest getHttpRequest() {
        return WebHelper.getHttpRequest();
    }
    /**取得{@link HttpServletResponse}类型对象。*/
    public HttpServletResponse getHttpResponse() {
        return WebHelper.getHttpResponse();
    }
    /**取得{@link HttpSession}类型对象。*/
    public HttpSession getHttpSession(boolean create) {
        return WebHelper.getHttpSession(create);
    }
}