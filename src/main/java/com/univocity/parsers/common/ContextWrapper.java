/*******************************************************************************
 * Copyright 2014 uniVocity Software Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.univocity.parsers.common;

/**
 * A simple a wrapper for a {@link Context}.
 *
 * @author uniVocity Software Pty Ltd - <a href="mailto:parsers@univocity.com">parsers@univocity.com</a>
 *
 */
public abstract class ContextWrapper implements Context {

	private final Context context;

	/**
	 * Wraps a {@link Context}.
	 * @param context the context object to be wrapped.
	 */
	public ContextWrapper(Context context) {
		this.context = context;
	}

	@Override
	public String[] headers() {
		return context.headers();
	}

	@Override
	public int[] extractedFieldIndexes() {
		return context.extractedFieldIndexes();
	}

	@Override
	public boolean columnsReordered() {
		return context.columnsReordered();
	}

	@Override
	public int indexOf(String header) {
		return context.indexOf(header);
	}

	@Override
	public int indexOf(Enum<?> header) {
		return context.indexOf(header);
	}

	@Override
	public int currentColumn() {
		return context.currentColumn();
	}

	@Override
	public long currentRecord() {
		return context.currentRecord();
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isStopped() {
		return true;
	}
}
