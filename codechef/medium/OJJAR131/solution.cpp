import { useState } from 'react';

const EMAIL_REGEX = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
const PHONE_REGEX = /^[+]?[(]?[0-9]{3}[)]?[-\s.]?[0-9]{3}[-\s.]?[0-9]{4,6}$/;

const initialFormData = {
    fullName: '',
        email: '',
            phone: '',
                address: '',
                    jobTitle: '',
                        company: '',
                            yearsExperience: '0-1',
                                skills: '',
                                };

                                const initialFormErrors = {
                                  fullName: null,
                                    email: null,
                                      phone: null, 
                                        address: null,
                                          agreeTerms: null,
                                          };

                                          function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
                                              const totalTabs = 3;
                                                  const isFirstTab = activeTabIndex === 0;
                                                      const isLastTab = activeTabIndex === totalTabs - 1;