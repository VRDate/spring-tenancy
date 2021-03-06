/*******************************************************************************
 * Copyright (c) 2010, 2011 SpringSource, a division of VMware 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Tasktop Technologies Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.tenancy.web;

import javax.servlet.http.HttpServletRequest;

/**
 * A {@link TenantIdentificationStrategy strategy} which looks for tenant identity from a given request header.
 * 
 * @author Clint Morgan (Tasktop Technologies Inc.)
 * 
 */
public class HeaderTenantIdentificationStrategy implements TenantIdentificationStrategy {

	private String headerName;

	@Override
	public Object identifyTenant(HttpServletRequest request) {
		return request.getHeader(headerName);
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}

}
