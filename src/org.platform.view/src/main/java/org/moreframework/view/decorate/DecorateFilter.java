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
package org.moreframework.view.decorate;
import java.io.IOException;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
/**
 * 
 * @version : 2013-6-14
 * @author ������ (zyc@byshell.org)
 */
public interface DecorateFilter {
    /**��ʼ���¼�*/
    public void init(FilterConfig filterConfig) throws ServletException;
    /**ִ��װ����*/
    public void doDecorate(DecorateServletRequest request, DecorateServletResponse response, DecorateFilterChain chain) throws ServletException, IOException;
    /**�����¼�*/
    public void destroy();
}