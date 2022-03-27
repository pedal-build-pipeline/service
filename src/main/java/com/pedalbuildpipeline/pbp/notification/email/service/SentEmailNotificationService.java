package com.pedalbuildpipeline.pbp.notification.email.service;

import com.pedalbuildpipeline.pbp.notification.email.entity.SentEmailNotificationRecord;
import com.pedalbuildpipeline.pbp.notification.email.repo.SentEmailNotificationRecordRepository;
import com.pedalbuildpipeline.pbp.notification.model.NotificationDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class SentEmailNotificationService {
  private final SentEmailNotificationRecordRepository sentEmailNotificationRecordRepository;

  public SentEmailNotificationRecord saveNotificationDetails(
      UUID userId, NotificationDetails notificationDetails) {
    return sentEmailNotificationRecordRepository.save(
        SentEmailNotificationRecord.builder()
            .providerId(notificationDetails.id())
            .userId(userId)
            .provider(notificationDetails.provider())
            .status(notificationDetails.status())
            .metadata(notificationDetails.metadata())
            .build());
  }
}
