package com.devteria.profile.controller;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("internal/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class InternalUserProfileController {

    UserProfileService userProfileService;

    @PostMapping()
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request){
        return userProfileService.createProfile(request);
    }

    @GetMapping
    List<UserProfileResponse> getAllProfiles(){
        return userProfileService.getAllProfiles();
    }
}
