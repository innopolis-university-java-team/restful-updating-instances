/**
 * Copyright 2020 the project restful-updating-instances authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.restful.updating.instances.option.field.approach.controller;

import io.swagger.annotations.ApiParam;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.restful.updating.instances.option.field.approach.model.payload.PeopleDetail;
import org.restful.updating.instances.option.field.approach.repository.PeopleRepository;
import org.springframework.web.bind.annotation.*;

/**
 * @project restful-updating-instances
 * @created 28.06.2020 07:54
 * <p>
 * @author Alexander A. Kropotin
 */
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(
        level = AccessLevel.PRIVATE,
        makeFinal = true
)
@CrossOrigin(value = "/**")
@RestController
@RequestMapping("/peoples")
public class PeopleController {

    PeopleRepository peopleRepository;

    @PatchMapping(
            path = "/{uid}"
    )
    public PeopleDetail update_patch(
            @ApiParam(
                    name="uid",
                    value = "The people entity uid",
                    required = true
            ) @PathVariable Long uid,
            @ApiParam(
                    name="people",
                    value = "The people entity model",
                    required = true
            ) @RequestBody PeopleDetail people) {
        log.info("Catch the request with dto: {}", people);

        return new PeopleDetail();

    }
}
