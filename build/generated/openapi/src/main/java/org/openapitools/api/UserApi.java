/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import com.example.userManagement.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-18T10:53:20.574+05:30[Asia/Kolkata]")
@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * We can create user by adding user info!
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     *         or successful operation (status code 200)
     */
    @ApiOperation(value = "Create user", nickname = "createUser", notes = "We can create user by adding user info!", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 200, message = "successful operation") })
    @PostMapping(
        value = "/user",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<User> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{userId} : Delete user
     * This can only be done by the logged in user.
     *
     * @param userId userId that needs to be deleted (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", response = Boolean.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @DeleteMapping(
        value = "/user/{userId}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Boolean> deleteUser(@ApiParam(value = "userId that needs to be deleted",required=true) @PathVariable("userId") String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{userId} : Get user by user id
     *
     * @param userId The user id that needs to be fetched. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(value = "Get user by user id", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @GetMapping(
        value = "/user/{userId}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<User> getUserByName(@ApiParam(value = "The user id that needs to be fetched.",required=true) @PathVariable("userId") String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{userId} : Updated user
     * This can only be done by the logged in user.
     *
     * @param userId user id that need to be updated (required)
     * @param body Updated user object (required)
     * @return successful operation (status code 200)
     *         or Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @PutMapping(
        value = "/user/{userId}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<User> updateUser(@ApiParam(value = "user id that need to be updated",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
