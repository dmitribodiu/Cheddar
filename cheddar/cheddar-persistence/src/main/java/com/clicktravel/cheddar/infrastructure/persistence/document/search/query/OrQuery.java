/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.clicktravel.cheddar.infrastructure.persistence.document.search.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrQuery extends StructuredQuery {

    private final List<StructuredQuery> queries = new ArrayList<>();

    public OrQuery(final Collection<StructuredQuery> queries) {
        this.queries.addAll(queries);
    }

    public void addQuery(final StructuredQuery query) {
        queries.add(query);
    }

    public List<StructuredQuery> getQueries() {
        return queries;
    }

    @Override
    public void accept(final QueryVisitor visitor) {
        visitor.visit(this);
    }
}